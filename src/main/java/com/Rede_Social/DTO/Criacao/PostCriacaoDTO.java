package com.Rede_Social.DTO.Criacao;

import java.util.List;
import java.util.UUID;

public record PostCriacaoDTO(UUID userId, String conteudo, List<TagCriacaoDTO> tags) {
}