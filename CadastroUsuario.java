//Bibliotecas usadas
import javax.swing.*; // componentes gráficos (JFrame, JLabel, JButton, etc.)
import java.awt.*; // layouts, cores, fontes, etc.
import java.awt.event.*; // Importa eventos de ação ( clique, teclado, etc.)

// Formulário de cadastro de usuário
public class CadastroUsuario {
    public static void main(String[] args) {

        // Criação do frame
        JFrame frame = new JFrame("Cadastro de Usuário");
        // Configurações da janela
        frame.setSize(400, 300); // largura x altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha o programa ao fechar a janela
        
        frame.setLocationRelativeTo(null); // centraliza a janela

        // Layout do frame
        frame.setLayout(new GridLayout(4, 2)); // 4 linhas (nome, email, idade, botão), 2 colunas (label, campo de texto)

        // Labels (nome, email e idade) e campos de texto
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField();

        // Seleção de sexo (desafio)
        JLabel sexoLabel = new JLabel("Sexo:");

        // Botões de rádio para seleção
        JRadioButton masculinoButton = new JRadioButton("Masculino");
        JRadioButton femininoButton = new JRadioButton("Feminino");

        // Agrupa os botões de rádio para que apenas um deles possa ser selecionado
        ButtonGroup sexoGroup = new ButtonGroup();
        sexoGroup.add(masculinoButton);
        sexoGroup.add(femininoButton);

        // Painel para organizar os botões de rádio horizontalmente, alinhados à esquerda
        JPanel sexoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sexoPanel.add(masculinoButton);
        sexoPanel.add(femininoButton);

        // Botão cadastrar
        JButton cadastrarButton = new JButton("Cadastrar");

        // Botão limpar (desafio)
        JButton limparButton = new JButton("Limpar");

        // Evento do botão cadastrar
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String email = emailField.getText();
                String idade = idadeField.getText();

                // Verifica qual botão de sexo está selecionado utilizando operador ternário
                String sexo = masculinoButton.isSelected() ? "Masculino"  femininoButton:.isSelected() ? "Feminino" : "Não informado";

                // Validação 
                if (nome.isEmpty() || email.isEmpty() || idade.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário cadastrado:\nNome: " + nome + "\nE-mail: " + email + "\nIdade: " + idade);
                }
            }
        });

        limparButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nomeField.setText("");
                emailField.setText("");
                idadeField.setText("");
                sexoGroup.clearSelection();
            }
        });

        // Adiciona os componentes ao frame 
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(idadeLabel);
        frame.add(idadeField);

        // Adiciona o painel de sexo (desafio) ao frame
        frame.add(sexoLabel);
        frame.add(sexoPanel);

        frame.add(new JLabel("")); // Espaço vazio para alinhar o botão
        
        // Adiciona o botão ao frame
        frame.add(cadastrarButton);

        // Exibe a janela
        frame.setVisible(true);

    }
}