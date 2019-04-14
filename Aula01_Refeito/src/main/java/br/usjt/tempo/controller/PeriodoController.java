package br.usjt.tempo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.tempo.model.Periodo;
import br.usjt.tempo.repository.PeriodoRepository;

@Controller
public class PeriodoController {

	@Autowired
	private PeriodoRepository repository;

	@GetMapping("/previsao_tempo")
	private ModelAndView listarPeriodos() throws IOException {
		ModelAndView modelAndView = new ModelAndView("lista_previsao_tempo");
		List<Periodo> periodos = repository.findAll();
		modelAndView.addObject("previsao_tempo", periodos);
		return modelAndView;
	}
}
