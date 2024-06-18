package com.KJNP.MediConnect.controller.nsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.KJNP.MediConnect.controller.nsh.biz.BoardDTO;
import com.KJNP.MediConnect.controller.nsh.biz.BoardService;

@Controller
public class WriteController {

	
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping(value="/writeBoard", method = RequestMethod.GET)
	public String writeBoardPage() {
		
		return "nsh/writeBoard";
	}
	
	@RequestMapping(value="/writeBoard",method=RequestMethod.POST)
	public String wrtieBoard(BoardDTO boardDTO) {
		
		boardService.insert(boardDTO);
		
		return "redirect:boardList";
	}
	
}
