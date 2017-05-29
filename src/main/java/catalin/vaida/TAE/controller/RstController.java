package catalin.vaida.TAE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import catalin.vaida.TAE.model.Quote;
import catalin.vaida.TAE.service.QuoteService;

@RestController
public class RstController {
	@Autowired
	private QuoteService quoteService;
	
	@RequestMapping("/quote")
    public Quote greeting(@RequestParam(value="id") Integer id) {
		return quoteService.getById(id);
    }
}
