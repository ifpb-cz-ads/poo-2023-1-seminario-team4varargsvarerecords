public record HospedeResponseDTO(Integer id, String nome, String email, String telefone) {
    public HospedeResponseDTO(Hospede hospede) {
        this(hospede.getId(), hospede.getNome(), hospede.getEmail(), hospede.getTelefone());
    }
}
