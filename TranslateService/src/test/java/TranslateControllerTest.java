@SpringBootTest
@AutoConfigureMockMvc
public class TranslateControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTranslateText() throws Exception {
        mockMvc.perform(post("/translate/text").content("Hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Texto traducido"));
    }
}
