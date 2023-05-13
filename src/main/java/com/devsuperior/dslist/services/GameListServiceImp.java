package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServiceImp implements GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> findAllGames = gameListRepository.findAll();
        return findAllGames.stream().map(GameListDTO::new).toList();
    }
}
