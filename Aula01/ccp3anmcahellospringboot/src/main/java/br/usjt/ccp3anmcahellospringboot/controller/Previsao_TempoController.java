package br.usjt.ccp3anmcahellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ccp3anmcahellospringboot.model.Alunos;
import br.usjt.ccp3anmcahellospringboot.model.repository.AlunosRepository;

@Controller 
public class Previsao_TempoController {
	
	@Autowired
	private Previsao_TempoRepository previsao_TempoRepo;

	@GetMapping ("/previsao_Tempo")
	public ModelAndView listarPrevisao_Tempo() {
		
		ModelAndView mv = new ModelAndView("lista_previsao_tempo");
		mv.addObject(new Previsao_Tempo());

		List<Previsao_Tempo> previsao_Tempo = previsao_TempoRepo.findAll();
		 
		mv.addObject("previsao_Tempo", previsao_Tempo);
		return mv;
		
	}
	
	@PostMapping
	public String salvar (Previsao_Tempo previsao_Tempo) {
	alunosRepo.save(previsao_Tempo);
	return "redirect:/previsao_Tempo";
	} 
}
