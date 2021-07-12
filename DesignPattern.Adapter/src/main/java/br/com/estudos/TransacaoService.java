package br.com.estudos;

import br.com.estudos.logger.ILogger;

public class TransacaoService {

    private ILogger logger;

    public TransacaoService(ILogger logger) {
        this.logger = logger;
    }

    public void realizarTransacao() {
        // Transa��o
        logger.log("Transa��o realizada");
    }
}
