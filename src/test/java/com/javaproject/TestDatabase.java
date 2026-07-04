package com.javaproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.javaproject.beans.BoardGame;

class TestDatabase extends BaseDatabaseTest {

    @Test
    public void testDatabaseAddBoardGame() {
        BoardGame boardGame = newTestBoardGame();

        int originalSize = da.getBoardGames().size();

        da.addBoardGame(boardGame);
        int newSize = da.getBoardGames().size();

        assertEquals(newSize, originalSize + 1);
    }

    // @Test
    // public void testDatabaseAddReview() {
    // List<BoardGame> boardGames = da.getBoardGames();
    // Long boardgameId = boardGames.get(0).getId();

    // Review review = new Review();
    // review.setGameId(boardgameId);
    // review.setText("This is review text");

    // int originalSize = da.getReviews(boardgameId).size();

    // da.addReview(review);
    // int newSize = da.getReviews(boardgameId).size();

    // assertEquals(newSize, originalSize + 1);
    // }

    // @Test
    // public void testDatabaseDeleteReview() {
    // List<BoardGame> boardGames = da.getBoardGames();
    // Long boardgameId = boardGames.get(0).getId();

    // List<Review> reviews = da.getReviews(boardgameId);
    // Long reviewId = reviews.get(0).getId();

    // int originalSize = da.getReviews(boardgameId).size();

    // da.deleteReview(reviewId);
    // int newSize = da.getReviews(boardgameId).size();
    // assertEquals(newSize, originalSize - 1);
    // }
}
