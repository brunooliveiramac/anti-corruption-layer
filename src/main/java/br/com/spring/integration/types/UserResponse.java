//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.03.19 at 12:23:34 PM CET
//


package br.com.spring.integration.types;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "atualizarUsuarioResponse")
public class UserResponse {

    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "nome", required = true)
    protected String nome;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getid() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setid(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nome property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public String getnome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setnome(String value) {
        this.nome = value;
    }


    @Override
    public String toString() {
        return "UserResponse{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
