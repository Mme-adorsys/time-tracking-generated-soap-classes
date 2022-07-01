/**
 * KundenverantwortlicherType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class KundenverantwortlicherType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(KundenverantwortlicherType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundenverantwortlicherType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("darfKundeAendern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "darfKundeAendern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitBudgetverantwortung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitBudgetverantwortung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

    private String userId;
    private String kundenNr;
    private Boolean darfKundeAendern;
    private Boolean primaer;
    private Boolean mitBudgetverantwortung;
    /* Zum Löschen des Kundenveratwortlicher-Zuordnung im Rahmen des
     * UpdateKunde-Requests auf 'delete' setzen. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public KundenverantwortlicherType() {
    }


    public KundenverantwortlicherType(
            String userId,
            String kundenNr,
            Boolean darfKundeAendern,
            Boolean primaer,
            Boolean mitBudgetverantwortung,
            String action) {
        this.userId = userId;
        this.kundenNr = kundenNr;
        this.darfKundeAendern = darfKundeAendern;
        this.primaer = primaer;
        this.mitBudgetverantwortung = mitBudgetverantwortung;
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
     * Gets the userId value for this KundenverantwortlicherType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this KundenverantwortlicherType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the kundenNr value for this KundenverantwortlicherType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this KundenverantwortlicherType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the darfKundeAendern value for this KundenverantwortlicherType.
     *
     * @return darfKundeAendern
     */
    public Boolean getDarfKundeAendern() {
        return darfKundeAendern;
    }

    /**
     * Sets the darfKundeAendern value for this KundenverantwortlicherType.
     *
     * @param darfKundeAendern
     */
    public void setDarfKundeAendern(Boolean darfKundeAendern) {
        this.darfKundeAendern = darfKundeAendern;
    }

    /**
     * Gets the primaer value for this KundenverantwortlicherType.
     *
     * @return primaer
     */
    public Boolean getPrimaer() {
        return primaer;
    }

    /**
     * Sets the primaer value for this KundenverantwortlicherType.
     *
     * @param primaer
     */
    public void setPrimaer(Boolean primaer) {
        this.primaer = primaer;
    }

    /**
     * Gets the mitBudgetverantwortung value for this KundenverantwortlicherType.
     *
     * @return mitBudgetverantwortung
     */
    public Boolean getMitBudgetverantwortung() {
        return mitBudgetverantwortung;
    }

    /**
     * Sets the mitBudgetverantwortung value for this KundenverantwortlicherType.
     *
     * @param mitBudgetverantwortung
     */
    public void setMitBudgetverantwortung(Boolean mitBudgetverantwortung) {
        this.mitBudgetverantwortung = mitBudgetverantwortung;
    }

    /**
     * Gets the action value for this KundenverantwortlicherType.
     *
     * @return action   * Zum Löschen des Kundenveratwortlicher-Zuordnung im Rahmen des
     * UpdateKunde-Requests auf 'delete' setzen.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this KundenverantwortlicherType.
     *
     * @param action   * Zum Löschen des Kundenveratwortlicher-Zuordnung im Rahmen des
     * UpdateKunde-Requests auf 'delete' setzen.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof KundenverantwortlicherType)) return false;
        KundenverantwortlicherType other = (KundenverantwortlicherType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.darfKundeAendern == null && other.getDarfKundeAendern() == null) ||
                        (this.darfKundeAendern != null &&
                                this.darfKundeAendern.equals(other.getDarfKundeAendern()))) &&
                ((this.primaer == null && other.getPrimaer() == null) ||
                        (this.primaer != null &&
                                this.primaer.equals(other.getPrimaer()))) &&
                ((this.mitBudgetverantwortung == null && other.getMitBudgetverantwortung() == null) ||
                        (this.mitBudgetverantwortung != null &&
                                this.mitBudgetverantwortung.equals(other.getMitBudgetverantwortung()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getDarfKundeAendern() != null) {
            _hashCode += getDarfKundeAendern().hashCode();
        }
        if (getPrimaer() != null) {
            _hashCode += getPrimaer().hashCode();
        }
        if (getMitBudgetverantwortung() != null) {
            _hashCode += getMitBudgetverantwortung().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
