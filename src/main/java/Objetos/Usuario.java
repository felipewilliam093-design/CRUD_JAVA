/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;





public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo;
    private String senhaHash;
    
     private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

 
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getLogin() {
        return login;
    }

    
    
    public void setLogin(String login) {
        this.login = login;
    }

  
    
    public String getSenha() {
        return senha;
    }

  
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getTipo() {
        return tipo;
    }

    
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public String getSenhaHash() {
        return senhaHash;
    }

   
    
    public void setSenhaHash(String senha) {
        this.senhaHash = encoder.encode(senha); //faz a criptografia
    }
    
    public boolean verificarSenha(String senhaDigitada){
        return encoder.matches(senhaDigitada, this.senha);
    }
}
