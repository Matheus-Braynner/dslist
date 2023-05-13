package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;

import java.util.List;

public interface GameService {

    List<GameMinDTO> findAll();

    GameDTO findByid(Long gameId);
}
