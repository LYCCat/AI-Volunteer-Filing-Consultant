package com.zzcat.langchain4jconsutant.aiservice;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

@AiService(
        wiringMode= AiServiceWiringMode.EXPLICIT,
        chatModel="openAiChatModel",
        streamingChatModel="openAiStreamingChatModel",
        chatMemoryProvider="chatMemoryProvider",
        contentRetriever="contentRetriever",
        tools="reservationTool"
)
public interface ConsultantService {

    @SystemMessage(fromResource = "system.txt")
    public Flux<String>chat(@MemoryId String memoryId, @UserMessage String message);

}
