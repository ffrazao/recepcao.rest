package com.frazao.recepcao.modelo.dominio.recepcao;

public enum UsuarioPerfil {

   ADMIN("Admin"), PARCEIRO("Parceiro"), CLIENTE("Cliente");

   private String descricao;

   private UsuarioPerfil(String descricao) {
      this.descricao = descricao;
   }

   public String getDescricao() {
      return this.descricao;
   }

   @Override
   public String toString() {
      return this.getDescricao();
   }

}