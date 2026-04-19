/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Italo
 */
import java.util.Arrays;

public class BrComIfbaAtividade08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // ─── 1. CRIAR PERFIS COM PERMISSÕES ───────────────────────────────
        PerfilUsuario perfilAdmin = new PerfilUsuario(
            "Administrador",
            Arrays.asList("criar_usuario", "deletar_usuario", "ver_logs")
        );
        
        PerfilUsuario perfilComum = new PerfilUsuario(
            "Usuário Comum",
            Arrays.asList("ver_perfil", "editar_perfil")
        );
        
         // Também é possível adicionar permissões depois da criação
        perfilComum.adicionarPermissao("trocar_senha");

        System.out.println("=== PERFIS CRIADOS ===");
        System.out.println(perfilAdmin);
        System.out.println(perfilComum);
        
         // ─── 2. CRIAR USUÁRIOS E ASSOCIAR AOS PERFIS ──────────────────────
        // O perfil é passado no construtor — aqui acontece o RELACIONAMENTO
        Usuario alice = new Usuario(perfilAdmin, "alice", "alice@email.com", "senha123", true);
        Usuario bob   = new Usuario(perfilComum, "bob",   "bob@email.com",   "abc456",  true);

        System.out.println("\n=== USUÁRIOS CRIADOS ===");
        System.out.println(alice);
        System.out.println(bob);
        
         // ─── 3. CRIAR SESSÕES PARA OS USUÁRIOS ────────────────────────────
        // Sessao recebe um Usuario — outro RELACIONAMENTO entre classes
        Sessao sessaoAlice = new Sessao(alice, "TOKEN-ALICE-XYZ");
        Sessao sessaoBob   = new Sessao(bob,   "TOKEN-BOB-ABC");

        System.out.println("\n=== SESSÕES CRIADAS ===");
        System.out.println(sessaoAlice);
        System.out.println(sessaoBob);
        
        // ─── 4. CRIAR LOGS DE AUDITORIA ───────────────────────────────────
        // LogAuditoria recebe um Usuario e registra o que ele fez
        LogAuditoria log1 = new LogAuditoria(alice, "login",           "192.168.0.1");
        LogAuditoria log2 = new LogAuditoria(bob,   "tentativa_login", "10.0.0.5");
        LogAuditoria log3 = new LogAuditoria(alice, "alteracao_senha", "192.168.0.1");

        System.out.println("\n=== LOGS DE AUDITORIA ===");
        System.out.println(log1);
        System.out.println(log2);
        System.out.println(log3);
        
        // ─── 5. DEMONSTRAR ACESSO AOS DADOS PELO RELACIONAMENTO ───────────
        // Por causa do relacionamento, conseguimos acessar dados encadeados
        System.out.println("\n=== ACESSO VIA RELACIONAMENTO ===");
        System.out.println("Perfil de " + alice.getNomeUsuario() + ": "
                           + alice.getPerfil().getDescricao());
        System.out.println("Permissões de " + bob.getNomeUsuario() + ": "
                           + bob.getPerfil().getPermissoes());
        System.out.println("Usuário da sessão: "
                           + sessaoAlice.getUsuario().getNomeUsuario());
    }
    
}
