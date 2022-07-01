/**
 * KommtGehtType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class KommtGehtType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(KommtGehtType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KommtGehtType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wann");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wann"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geraetTyp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geraetTyp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geraetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geraetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String userId;
    /* wann kommt oder geht */
    private String wann;
    /* kommt oder geht */
    private String typ;
    private String bemerkung;
    /* Terminal , App , Web ( Web-Oberfläche) oder Task (Automatisch
     * abgelmeldet) */
    private String geraetTyp;
    private String geraetName;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public KommtGehtType() {
    }


    public KommtGehtType(
            String userId,
            String wann,
            String typ,
            String bemerkung,
            String geraetTyp,
            String geraetName) {
        this.userId = userId;
        this.wann = wann;
        this.typ = typ;
        this.bemerkung = bemerkung;
        this.geraetTyp = geraetTyp;
        this.geraetName = geraetName;
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
     * Gets the userId value for this KommtGehtType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this KommtGehtType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the wann value for this KommtGehtType.
     *
     * @return wann   * wann kommt oder geht
     */
    public String getWann() {
        return wann;
    }

    /**
     * Sets the wann value for this KommtGehtType.
     *
     * @param wann   * wann kommt oder geht
     */
    public void setWann(String wann) {
        this.wann = wann;
    }

    /**
     * Gets the typ value for this KommtGehtType.
     *
     * @return typ   * kommt oder geht
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the typ value for this KommtGehtType.
     *
     * @param typ   * kommt oder geht
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Gets the bemerkung value for this KommtGehtType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this KommtGehtType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the geraetTyp value for this KommtGehtType.
     *
     * @return geraetTyp   * Terminal , App , Web ( Web-Oberfläche) oder Task (Automatisch
     * abgelmeldet)
     */
    public String getGeraetTyp() {
        return geraetTyp;
    }

    /**
     * Sets the geraetTyp value for this KommtGehtType.
     *
     * @param geraetTyp   * Terminal , App , Web ( Web-Oberfläche) oder Task (Automatisch
     * abgelmeldet)
     */
    public void setGeraetTyp(String geraetTyp) {
        this.geraetTyp = geraetTyp;
    }

    /**
     * Gets the geraetName value for this KommtGehtType.
     *
     * @return geraetName
     */
    public String getGeraetName() {
        return geraetName;
    }

    /**
     * Sets the geraetName value for this KommtGehtType.
     *
     * @param geraetName
     */
    public void setGeraetName(String geraetName) {
        this.geraetName = geraetName;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof KommtGehtType)) return false;
        KommtGehtType other = (KommtGehtType) obj;
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
                ((this.wann == null && other.getWann() == null) ||
                        (this.wann != null &&
                                this.wann.equals(other.getWann()))) &&
                ((this.typ == null && other.getTyp() == null) ||
                        (this.typ != null &&
                                this.typ.equals(other.getTyp()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.geraetTyp == null && other.getGeraetTyp() == null) ||
                        (this.geraetTyp != null &&
                                this.geraetTyp.equals(other.getGeraetTyp()))) &&
                ((this.geraetName == null && other.getGeraetName() == null) ||
                        (this.geraetName != null &&
                                this.geraetName.equals(other.getGeraetName())));
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
        if (getWann() != null) {
            _hashCode += getWann().hashCode();
        }
        if (getTyp() != null) {
            _hashCode += getTyp().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getGeraetTyp() != null) {
            _hashCode += getGeraetTyp().hashCode();
        }
        if (getGeraetName() != null) {
            _hashCode += getGeraetName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
