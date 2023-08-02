package fr.fms.web;

import fr.fms.service.HotelRoomServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import fr.fms.web.HotelController;

@SpringBootTest
@AutoConfigureMockMvc
public class HotelControllerTest {


        @Autowired
        private MockMvc mockMvc;
        @MockBean
        private HotelRoomServiceImpl hotelRoomService;
        @Test
       public void testGetAllHotels() throws Exception {
           mockMvc.perform(get("/hotels"))
            .andExpect(status().isOk());
        }

}
