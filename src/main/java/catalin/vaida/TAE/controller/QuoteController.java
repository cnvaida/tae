package catalin.vaida.TAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import catalin.vaida.TAE.model.rest.Quote;
import catalin.vaida.TAE.service.QuoteService;

@Controller
public class QuoteController {
	@Autowired
	private QuoteService quoteService;
	
    @RequestMapping("/add")
    public String add(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        quoteService.create(quote);
        
        model.addAttribute("quote", quote.getValue().getQuote());
        return "add";
    }

    @RequestMapping("/all")
    public String all(Model model) {
    	model.addAttribute("quotes", quoteService.getAll());
    	return "all";
    }
}