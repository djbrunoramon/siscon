package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.views.HabitationView;
import br.com.indiotec.apps.siscon.model.Habitation;
import br.com.indiotec.apps.siscon.repository.HabitationRepository;
import br.com.indiotec.apps.siscon.utils.TestUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HabitationControllerTest {

    @Autowired
    private MockMvc habitationController;

    @Autowired
    private HabitationRepository habitationRepository;

    private static final String URL_HABITATION = "/api/v1/habitation";

    @BeforeEach
    void getSetupTests() {
        List<Habitation> habitations = new ArrayList<>();
        habitations.add(new Habitation("A", "1", "100", "AP"));
        habitations.add(new Habitation("A", "2", "101", "AP"));
        habitations.add(new Habitation("B", "1", "100", "AP"));
        habitations.add(new Habitation("B", "2", "101", "AP"));
        habitations.add(new Habitation("C", "1", "100", "AP"));
        habitationRepository.saveAll(habitations);
    }

    @Test
    @Transactional
    void getAllHabitations() throws Exception {
        MockHttpServletResponse response = habitationController
                .perform(get(URL_HABITATION)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn().getResponse();

        Habitation[] habitations = TestUtil.toObject(response.getContentAsByteArray(), Habitation[].class);

        assertThat(habitations).hasSize(5);
    }

    @Test
    @Transactional
    void getHabitationById() throws Exception {

        MockHttpServletResponse response = habitationController
                .perform(get(URL_HABITATION + "/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn().getResponse();

        Habitation habitationView = TestUtil.toObject(response.getContentAsByteArray(), Habitation.class);

        assertThat(habitationView.getBlock()).isEqualTo("A");
    }

    @Test
    void saveHabitation() {
    }

    @Test
    void updateHabitation() {
    }
}