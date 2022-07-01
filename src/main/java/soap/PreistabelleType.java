/**
 * PreistabelleType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten einer einzelnen Preistabelle. Diese wird sowohl als Projekt-
 * als auch als Kundenpreistabelle verwendet, abhängig davon, ob eine
 * Projektnummer oder eine Kundennummer angegeben wurde.
 */
public class PreistabelleType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PreistabelleType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreistabelleType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gueltigAb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gueltigAb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preisListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "preis"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preisfaktorListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisfaktorListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisfaktorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "preisfaktor"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    /* Die Id der Preistabelle. Pflicht bei Update und Löschen. */
    private Integer id;
    /* Das Datum, ab dem die Preistabelle gilt. Format: JJJJ-MM-TT.
     * Pflicht. */
    private String gueltigAb;
    /* Die Nummer des Kunden, für den die Preistabelle gilt (Kundenpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Projektnummer angegeben werden. */
    private String kundenNr;
    /* Die Nummer des Projektes, für das die Preistabelle gilt (Projektpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Kundennummer angegeben werden. */
    private String projektNr;
    /* Die Liste der Preise dieser Preistabelle. */
    private PreisType[] preisListe;
    /* Die Liste der Preisfaktoren dieser Preistabelle. */
    private PreisfaktorType[] preisfaktorListe;
    private Integer projektId;
    /* Aktion. Um die Preistabelle im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PreistabelleType() {
    }


    public PreistabelleType(
            Integer id,
            String gueltigAb,
            String kundenNr,
            String projektNr,
            PreisType[] preisListe,
            PreisfaktorType[] preisfaktorListe,
            Integer projektId,
            String action) {
        this.id = id;
        this.gueltigAb = gueltigAb;
        this.kundenNr = kundenNr;
        this.projektNr = projektNr;
        this.preisListe = preisListe;
        this.preisfaktorListe = preisfaktorListe;
        this.projektId = projektId;
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
     * Gets the id value for this PreistabelleType.
     *
     * @return id   * Die Id der Preistabelle. Pflicht bei Update und Löschen.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this PreistabelleType.
     *
     * @param id   * Die Id der Preistabelle. Pflicht bei Update und Löschen.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the gueltigAb value for this PreistabelleType.
     *
     * @return gueltigAb   * Das Datum, ab dem die Preistabelle gilt. Format: JJJJ-MM-TT.
     * Pflicht.
     */
    public String getGueltigAb() {
        return gueltigAb;
    }

    /**
     * Sets the gueltigAb value for this PreistabelleType.
     *
     * @param gueltigAb   * Das Datum, ab dem die Preistabelle gilt. Format: JJJJ-MM-TT.
     * Pflicht.
     */
    public void setGueltigAb(String gueltigAb) {
        this.gueltigAb = gueltigAb;
    }

    /**
     * Gets the kundenNr value for this PreistabelleType.
     *
     * @return kundenNr   * Die Nummer des Kunden, für den die Preistabelle gilt (Kundenpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Projektnummer angegeben werden.
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this PreistabelleType.
     *
     * @param kundenNr   * Die Nummer des Kunden, für den die Preistabelle gilt (Kundenpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Projektnummer angegeben werden.
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the projektNr value for this PreistabelleType.
     *
     * @return projektNr   * Die Nummer des Projektes, für das die Preistabelle gilt (Projektpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Kundennummer angegeben werden.
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this PreistabelleType.
     *
     * @param projektNr   * Die Nummer des Projektes, für das die Preistabelle gilt (Projektpreistabelle).
     * Ist dieses Feld gesetzt, so darf keine Kundennummer angegeben werden.
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the preisListe value for this PreistabelleType.
     *
     * @return preisListe   * Die Liste der Preise dieser Preistabelle.
     */
    public PreisType[] getPreisListe() {
        return preisListe;
    }

    /**
     * Sets the preisListe value for this PreistabelleType.
     *
     * @param preisListe   * Die Liste der Preise dieser Preistabelle.
     */
    public void setPreisListe(PreisType[] preisListe) {
        this.preisListe = preisListe;
    }

    /**
     * Gets the preisfaktorListe value for this PreistabelleType.
     *
     * @return preisfaktorListe   * Die Liste der Preisfaktoren dieser Preistabelle.
     */
    public PreisfaktorType[] getPreisfaktorListe() {
        return preisfaktorListe;
    }

    /**
     * Sets the preisfaktorListe value for this PreistabelleType.
     *
     * @param preisfaktorListe   * Die Liste der Preisfaktoren dieser Preistabelle.
     */
    public void setPreisfaktorListe(PreisfaktorType[] preisfaktorListe) {
        this.preisfaktorListe = preisfaktorListe;
    }

    /**
     * Gets the projektId value for this PreistabelleType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this PreistabelleType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the action value for this PreistabelleType.
     *
     * @return action   * Aktion. Um die Preistabelle im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this PreistabelleType.
     *
     * @param action   * Aktion. Um die Preistabelle im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreistabelleType)) return false;
        PreistabelleType other = (PreistabelleType) obj;
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
                ((this.gueltigAb == null && other.getGueltigAb() == null) ||
                        (this.gueltigAb != null &&
                                this.gueltigAb.equals(other.getGueltigAb()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.preisListe == null && other.getPreisListe() == null) ||
                        (this.preisListe != null &&
                                java.util.Arrays.equals(this.preisListe, other.getPreisListe()))) &&
                ((this.preisfaktorListe == null && other.getPreisfaktorListe() == null) ||
                        (this.preisfaktorListe != null &&
                                java.util.Arrays.equals(this.preisfaktorListe, other.getPreisfaktorListe()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
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
        if (getGueltigAb() != null) {
            _hashCode += getGueltigAb().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getPreisListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPreisListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPreisListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreisfaktorListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPreisfaktorListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPreisfaktorListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
