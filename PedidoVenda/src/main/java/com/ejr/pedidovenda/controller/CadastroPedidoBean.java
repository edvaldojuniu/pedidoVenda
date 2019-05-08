package com.ejr.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.ejr.pedidovenda.model.EnderecoEntrega;
import com.ejr.pedidovenda.model.Pedido;
import com.erj.pedidovenda.service.NegocioException;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pedido pedido;
	
	private List<Integer> itens;
	
	public CadastroPedidoBean() {
		pedido = new Pedido();
		pedido.setEnderecoEntrega(new EnderecoEntrega());
		itens = new ArrayList<Integer>();		
		itens.add(1);
	}
	
	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo pois ainda não foi implementado.");
	}
	
	public List<Integer> getItens(){
		return itens;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
}
