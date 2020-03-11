package net.cartola.amp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RootController {

	@GetMapping({ "/", "/index" })
	public String listAllFiles() {
		return "index";
	}

	@GetMapping("/nossas-lojas")
	public String nossasLojas() {
		return "nossas-lojas";
	}

	@GetMapping("/quem-somos")
	public String quemSomos() {
		return "quem-somos";
	}

	@RequestMapping(value = "/x/{x}", method = RequestMethod.GET)
	public String itemX(@PathVariable("x") Long x) {
		return "produto : " + x;
	}
	
	@RequestMapping(value = "/x/{x}/{s}", method = RequestMethod.GET)
	public String itemX(@PathVariable("x") Long x, @PathVariable("s") String s) {
		return "produto : " + x + "/" + s;
	}

}
