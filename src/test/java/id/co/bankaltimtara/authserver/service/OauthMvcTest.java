package id.co.bankaltimtara.authserver.service;

import id.co.bankaltimtara.authserver.AuthServerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebAppConfiguration
//@SpringBootTest(AuthServerApplication.class)
public class OauthMvcTest {

//    @Autowired
//    private WebApplicationContext wac;
//
//    @Autowired
//    private FilterChainProxy springSecurityFilterChain;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).addFilter(springSecurityFilterChain).build();
//    }
//
//    private String obtainAccessToken(String username, String password) throws Exception {
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("grant_type", "password");
//        params.add("username", username);
//        params.add("password", password);
//        params.add("client_id", "BPD-CLIENT");
//
//        ResultActions result =
//                mockMvc.perform(post("/oauth/token")
//                    .params(params).with(httpBasic("BPD-CLIENT","bankaltimtara1234#"))
//                    .accept("application/json;charset=UTF-8")
//                ).andExpect(status().isOk()).andExpect(content().contentType("application/json;charset=UTF-8"));
//    }

//    @Test
//    public void givenNoToken_whenGetSecureRequest_thenUnauthorized() throws Exception {
//        mockMvc.perform(get("/employee")
//                .param("email", EMAIL))
//                .andExpect(status().isUnauthorized());
//    }
//
//    @Test
//    public void givenInvalidRole_whenGetSecureRequest_thenForbidden() throws Exception {
//        String accessToken = obtainAccessToken("user1", "pass");
//        mockMvc.perform(get("/employee")
//                .header("Authorization", "Bearer " + accessToken)
//                .param("email", "jim@yahoo.com"))
//                .andExpect(status().isForbidden());
//    }
//
//    @Test
//    public void givenToken_whenPostGetSecureRequest_thenOk() throws Exception {
//        String accessToken = obtainAccessToken("admin", "nimda");
//
//        String employeeString = "{\"email\":\"jim@yahoo.com\",\"name\":\"Jim\"}";
//
//        mockMvc.perform(post("/employee")
//                .header("Authorization", "Bearer " + accessToken)
//                .contentType("application/json;charset=UTF-8")
//      .content(employeeString)
//                .accept("application/json;charset=UTF-8"))
//      .andExpect(status().isCreated());
//
//        mockMvc.perform(get("/employee")
//                .param("email", "jim@yahoo.com")
//                .header("Authorization", "Bearer " + accessToken)
//                .accept("application/json;charset=UTF-8"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType("application/json;charset=UTF-8"))
//      .andExpect(jsonPath("$.name", is("Jim")));
//    }

}