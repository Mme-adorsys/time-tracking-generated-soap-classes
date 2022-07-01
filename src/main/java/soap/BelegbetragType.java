/**
 * BelegbetragType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Ein einem Beleg zugeordneter Betrag
 */
public class BelegbetragType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BelegbetragType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegbetragType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steuersatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steuersatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "menge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privatAnteil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privatAnteil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faktBetrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faktBetrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Wenn es beim Update angegeben und ein Belegbetrag vorhanden
     * dann wird dieser bearbeitet ansonsten wird neu erstellt. */
    private Integer id;
    /* Die Nummer des Belegs, dem dieser Betrag zugeordnet ist. */
    private Integer belegNr;
    /* Der Steuersatz zu diesem Betrag. */
    private Double steuersatz;
    /* Die Menge. */
    private Double menge;
    /* Der Betrag. */
    private Double betrag;
    /* Der private Anteil am Betrag. */
    private Double privatAnteil;
    /* Der an den Kunden zu fakturierende Betrag. */
    private Double faktBetrag;
    /* Aktion. Um den Betrag im Rahmen eines Updates zu löschen muss
     * hier 'delete' angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BelegbetragType() {
    }


    public BelegbetragType(
            Integer id,
            Integer belegNr,
            Double steuersatz,
            Double menge,
            Double betrag,
            Double privatAnteil,
            Double faktBetrag,
            String action) {
        this.id = id;
        this.belegNr = belegNr;
        this.steuersatz = steuersatz;
        this.menge = menge;
        this.betrag = betrag;
        this.privatAnteil = privatAnteil;
        this.faktBetrag = faktBetrag;
        this.action = action;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the id value for this BelegbetragType.
     *
     * @return id   * Wenn es beim Update angegeben und ein Belegbetrag vorhanden
     * dann wird dieser bearbeitet ansonsten wird neu erstellt.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this BelegbetragType.
     *
     * @param id   * Wenn es beim Update angegeben und ein Belegbetrag vorhanden
     * dann wird dieser bearbeitet ansonsten wird neu erstellt.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the belegNr value for this BelegbetragType.
     *
     * @return belegNr   * Die Nummer des Belegs, dem dieser Betrag zugeordnet ist.
     */
    public Integer getBelegNr() {
        return belegNr;
    }

    /**
     * Sets the belegNr value for this BelegbetragType.
     *
     * @param belegNr   * Die Nummer des Belegs, dem dieser Betrag zugeordnet ist.
     */
    public void setBelegNr(Integer belegNr) {
        this.belegNr = belegNr;
    }

    /**
     * Gets the steuersatz value for this BelegbetragType.
     *
     * @return steuersatz   * Der Steuersatz zu diesem Betrag.
     */
    public Double getSteuersatz() {
        return steuersatz;
    }

    /**
     * Sets the steuersatz value for this BelegbetragType.
     *
     * @param steuersatz   * Der Steuersatz zu diesem Betrag.
     */
    public void setSteuersatz(Double steuersatz) {
        this.steuersatz = steuersatz;
    }

    /**
     * Gets the menge value for this BelegbetragType.
     *
     * @return menge   * Die Menge.
     */
    public Double getMenge() {
        return menge;
    }

    /**
     * Sets the menge value for this BelegbetragType.
     *
     * @param menge   * Die Menge.
     */
    public void setMenge(Double menge) {
        this.menge = menge;
    }

    /**
     * Gets the betrag value for this BelegbetragType.
     *
     * @return betrag   * Der Betrag.
     */
    public Double getBetrag() {
        return betrag;
    }

    /**
     * Sets the betrag value for this BelegbetragType.
     *
     * @param betrag   * Der Betrag.
     */
    public void setBetrag(Double betrag) {
        this.betrag = betrag;
    }

    /**
     * Gets the privatAnteil value for this BelegbetragType.
     *
     * @return privatAnteil   * Der private Anteil am Betrag.
     */
    public Double getPrivatAnteil() {
        return privatAnteil;
    }

    /**
     * Sets the privatAnteil value for this BelegbetragType.
     *
     * @param privatAnteil   * Der private Anteil am Betrag.
     */
    public void setPrivatAnteil(Double privatAnteil) {
        this.privatAnteil = privatAnteil;
    }

    /**
     * Gets the faktBetrag value for this BelegbetragType.
     *
     * @return faktBetrag   * Der an den Kunden zu fakturierende Betrag.
     */
    public Double getFaktBetrag() {
        return faktBetrag;
    }

    /**
     * Sets the faktBetrag value for this BelegbetragType.
     *
     * @param faktBetrag   * Der an den Kunden zu fakturierende Betrag.
     */
    public void setFaktBetrag(Double faktBetrag) {
        this.faktBetrag = faktBetrag;
    }

    /**
     * Gets the action value for this BelegbetragType.
     *
     * @return action   * Aktion. Um den Betrag im Rahmen eines Updates zu löschen muss
     * hier 'delete' angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this BelegbetragType.
     *
     * @param action   * Aktion. Um den Betrag im Rahmen eines Updates zu löschen muss
     * hier 'delete' angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BelegbetragType)) return false;
        BelegbetragType other = (BelegbetragType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.belegNr == null && other.getBelegNr() == null) ||
                        (this.belegNr != null &&
                                this.belegNr.equals(other.getBelegNr()))) &&
                ((this.steuersatz == null && other.getSteuersatz() == null) ||
                        (this.steuersatz != null &&
                                this.steuersatz.equals(other.getSteuersatz()))) &&
                ((this.menge == null && other.getMenge() == null) ||
                        (this.menge != null &&
                                this.menge.equals(other.getMenge()))) &&
                ((this.betrag == null && other.getBetrag() == null) ||
                        (this.betrag != null &&
                                this.betrag.equals(other.getBetrag()))) &&
                ((this.privatAnteil == null && other.getPrivatAnteil() == null) ||
                        (this.privatAnteil != null &&
                                this.privatAnteil.equals(other.getPrivatAnteil()))) &&
                ((this.faktBetrag == null && other.getFaktBetrag() == null) ||
                        (this.faktBetrag != null &&
                                this.faktBetrag.equals(other.getFaktBetrag()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getBelegNr() != null) {
            _hashCode += getBelegNr().hashCode();
        }
        if (getSteuersatz() != null) {
            _hashCode += getSteuersatz().hashCode();
        }
        if (getMenge() != null) {
            _hashCode += getMenge().hashCode();
        }
        if (getBetrag() != null) {
            _hashCode += getBetrag().hashCode();
        }
        if (getPrivatAnteil() != null) {
            _hashCode += getPrivatAnteil().hashCode();
        }
        if (getFaktBetrag() != null) {
            _hashCode += getFaktBetrag().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
