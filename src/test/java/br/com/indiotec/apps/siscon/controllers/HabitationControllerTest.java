package br.com.indiotec.apps.siscon.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HabitationControllerTest {

    @Autowired
    private MockMvc habitationController;

    private static final String URL_HABITATION = "/api/v1/habitation";

    @Test
    @Transactional
    void getAllHabitations() throws Exception {
        habitationController
                .perform(get(URL_HABITATION))
                .andExpect(status().isOk());
    }

    @Test
    void testGetAllHabitations() {
    }

    @Test
    void saveHabitation() {
    }

    @Test
    void updateHabitation() {
    }
}