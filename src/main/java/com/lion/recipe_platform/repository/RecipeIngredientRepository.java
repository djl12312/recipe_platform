package com.lion.recipe_platform.repository;


import com.lion.recipe_platform.model.RecipeIngredient;
import com.lion.recipe_platform.model.RecipeIngredientId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, RecipeIngredientId> {
}