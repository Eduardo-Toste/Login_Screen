# Login Screen Test

## Versão 1.0

## Descrição
Este sistema se baseia em testes rápidos utilizando o Test Drive Development com JUnit durante o desenvolvimento da classe LoginScreen.

## Classe LoginScreen
A classe LoginScreen está responsável por conter as funcionalidades que serão testdas na classe LoginScreenTest. Consequentemente, validando ou não o login durante o teste.

```
public class LoginScreen {
	
	private Map<String, String> userDatabase;
	
	public LoginScreen() {
		
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alica", "securepass");

	}

	public boolean login(String username, String password) {
		
		if(userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}

	public void addUser(String username, String password) {
		userDatabase.put(username, password);
		
	}
```
- private Map<String, String> userDatabase; = Simula um banco de dados aramzenando as Strings.
- public class LoginScreen {} = Armazena as informações no banco de dados.
- public boolean login(String username, String password) {} = Utiliza as informações do banco para tentar realizar o login.
- public void addUser(String username, String password) {} = Adiciona um usuário ao banco de dados.

## Classe LoginScreenTest
Classe utilizada para conseguir realizar os testes e utilizar os métodos definidos na classe LoginScreen, validando ou não o sistema.

```
public class LoginScreenTest {
	
		@Test
		public void testSuccessFulLogin() {
			LoginScreen loginScreen = new LoginScreen();
			assertTrue(loginScreen.login("john1", "password123" ));
		}
		
		@Test
		public void testFailedLogin() {
			LoginScreen loginScreen = new LoginScreen();
			assertFalse(loginScreen.login("john", "wrongpassword"));
		}
		
		@Test
		public void testAddUser() {
			LoginScreen loginScreen = new LoginScreen();
			loginScreen.addUser("testuser", "testpassword");
			assertTrue(loginScreen.login("testuser", "testpassword"));
	}
}
```
- public void testSuccessFulLogin() {} = Teste utilizado para quando o login der sucesso.
- public void testFailedLogin() {} = Teste utilizado para quando o login falhar.
- public void testAddUser() {} = Teste utilizado para adicionar um novo usuário.

## Tecnologias utilizadas
- JUnit 5
- IDE Eclipse
- Javadoc
- JDK 20

## Considerações Finais
O Test-Driven Development (TDD) no desenvolvimento de software oferece benefícios significativos, como a melhoria da qualidade do código, facilitação da manutenção, documentação viva, redução de erros, desenvolvimento incremental, refatoração segura, cultivo de uma cultura de qualidade e aumento da produtividade a longo prazo. Essa abordagem, que envolve a criação de testes antes da implementação, contribui para um processo mais eficiente, detectando problemas precocemente e promovendo um código mais robusto e confiável.
