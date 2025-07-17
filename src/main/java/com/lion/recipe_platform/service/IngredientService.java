package com.lion.recipe_platform.service;

import com.lion.recipe_platform.dto.IngredientDto;
import com.lion.recipe_platform.dto.IngredientResponseDto;
import com.lion.recipe_platform.repository.IngredientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientResponseDto create(IngredientDto dto) {
        if (ingredientRepository.findByName(dto.getName()).isPresent()) {}
            throw new IllegalStateException("재료가 이미 존재합니다.");
    }
}
