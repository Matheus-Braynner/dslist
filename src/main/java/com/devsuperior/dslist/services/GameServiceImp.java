package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImp implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private ModelMapper mapper;

    public List<GameMinDTO> findAll() {
        List<Game> findAllGames = gameRepository.findAll();
        return findAllGames.stream().map(GameMinDTO::new).toList();
    }
}
