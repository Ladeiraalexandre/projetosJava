package ed.estudos.screensound.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPTService {
	
	public static String obterInformacao(String texto) {
		
		String apiKey = System.getenv("OPENAI_APIKEY");
		if (apiKey == null || apiKey.isEmpty()) {
		    throw new IllegalStateException("A variável de ambiente OPENAI_APIKEY não está definida.");
		}
		OpenAiService service = new OpenAiService(apiKey);
       
        CompletionRequest requisicao = CompletionRequest.builder()
                .model("babbage-002")
                .prompt("me fale sobre o artista: " + texto)
                .maxTokens(1000)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
        
	}

}
