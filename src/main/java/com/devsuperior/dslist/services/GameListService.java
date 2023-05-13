package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;

import java.util.List;

public interface GameListService {

    List<GameListDTO> findAll();
}
