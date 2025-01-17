/*
 *
 *  Copyright (c) 2018-2020 Givantha Kalansuriya, This source is a part of
 *   Staxrt - sample application source code.
 *   http://staxrt.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.staxrt.tutorial.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * The type Vehiculo.
 *
 * @author Givantha Kalansuriya
 */
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "aparcadoOK", nullable = false)
    private Boolean aparcadoOk;;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "latitud", nullable = false)
    private long latitud;

    @Column(name = "longitud", nullable = false)
    private long longitud;

    @Column(name = "libre", nullable = false)
    private Boolean libre;


    public Vehiculo() {

    }
    
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean getAparcadoOk() {
        return this.aparcadoOk;
    }

    public void setAparcadoOk(boolean aparcadoOk) {
        this.aparcadoOk = aparcadoOk;
    }
    

    public boolean getLibre() {
        return this.libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public long getLatitud() {
        return this.latitud;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
    }

    public long getLongitud() {
      return this.longitud;
  }

  public void setLongitud(long longitud) {
      this.longitud = longitud;
  }


}

/* use users_database;
SHOW TABLES;
SELECT * FROM users;
*/
