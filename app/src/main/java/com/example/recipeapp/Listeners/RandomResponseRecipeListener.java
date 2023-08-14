package com.example.recipeapp.Listeners;

import com.example.recipeapp.Models.RandomRecipeApiResponse;

public interface RandomResponseRecipeListener {
    void didFetch(RandomRecipeApiResponse response, String message);
    void didError(String message);
}
