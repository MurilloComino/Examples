/*
 *
 *  * Created by Murillo Comino on 09/02/19 18:23
 *  * Github: github.com/MurilloComino
 *  * StackOverFlow: pt.stackoverflow.com/users/128573
 *  * Email: murillo_comino@hotmail.com
 *  *
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 09/02/19 18:23
 *
 */

package com.onimus.courseimpacta.lab05.domain.exception;

public class DocumentoException extends Exception {

    public DocumentoException(int detailMessage) {
        super(String.valueOf(detailMessage));
    }
}
