package tests;

import clasesdto.ClienteDTO;

public class TestClienteDTO {
	public static void main(String[] args) {
		
		ClienteDTO cli1 = new ClienteDTO(1231, "De la Fuente", 123123, "VIP");
		ClienteDTO cli2 = new ClienteDTO(1231, "De la Fuente", 123123, "VIP");
		ClienteDTO cli3 = new ClienteDTO(234234, "Otro Distinto", 54323, "VIP");
		
		System.out.println(cli1.getApellidos());
		
		System.out.println(cli1);
		
		
		System.out.println(cli1.equals(cli2));
		System.out.println(cli1.equals(cli3));
	}

}
