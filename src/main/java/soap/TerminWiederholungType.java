/**
 * TerminWiederholungType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class TerminWiederholungType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TerminWiederholungType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TerminWiederholungType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taeglich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taeglich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TaeglichType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("woechentlich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "woechentlich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "WoechentlichType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monatlich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monatlich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MonatlichType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jaehrlich");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jaehrlich"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "JaehrlichType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* 1=täglich; 2=wochentags; 3=wöchentlich;
     *             					4=monatlich; 5=jährlich */
    private TaeglichType taeglich;
    private WoechentlichType woechentlich;
    private MonatlichType monatlich;
    private JaehrlichType jaehrlich;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TerminWiederholungType() {
    }


    public TerminWiederholungType(
            TaeglichType taeglich,
            WoechentlichType woechentlich,
            MonatlichType monatlich,
            JaehrlichType jaehrlich) {
        this.taeglich = taeglich;
        this.woechentlich = woechentlich;
        this.monatlich = monatlich;
        this.jaehrlich = jaehrlich;
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
     * Gets the taeglich value for this TerminWiederholungType.
     *
     * @return taeglich   * 1=täglich; 2=wochentags; 3=wöchentlich;
     *             					4=monatlich; 5=jährlich
     */
    public TaeglichType getTaeglich() {
        return taeglich;
    }

    /**
     * Sets the taeglich value for this TerminWiederholungType.
     *
     * @param taeglich   * 1=täglich; 2=wochentags; 3=wöchentlich;
     *             					4=monatlich; 5=jährlich
     */
    public void setTaeglich(TaeglichType taeglich) {
        this.taeglich = taeglich;
    }

    /**
     * Gets the woechentlich value for this TerminWiederholungType.
     *
     * @return woechentlich
     */
    public WoechentlichType getWoechentlich() {
        return woechentlich;
    }

    /**
     * Sets the woechentlich value for this TerminWiederholungType.
     *
     * @param woechentlich
     */
    public void setWoechentlich(WoechentlichType woechentlich) {
        this.woechentlich = woechentlich;
    }

    /**
     * Gets the monatlich value for this TerminWiederholungType.
     *
     * @return monatlich
     */
    public MonatlichType getMonatlich() {
        return monatlich;
    }

    /**
     * Sets the monatlich value for this TerminWiederholungType.
     *
     * @param monatlich
     */
    public void setMonatlich(MonatlichType monatlich) {
        this.monatlich = monatlich;
    }

    /**
     * Gets the jaehrlich value for this TerminWiederholungType.
     *
     * @return jaehrlich
     */
    public JaehrlichType getJaehrlich() {
        return jaehrlich;
    }

    /**
     * Sets the jaehrlich value for this TerminWiederholungType.
     *
     * @param jaehrlich
     */
    public void setJaehrlich(JaehrlichType jaehrlich) {
        this.jaehrlich = jaehrlich;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TerminWiederholungType)) return false;
        TerminWiederholungType other = (TerminWiederholungType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.taeglich == null && other.getTaeglich() == null) ||
                        (this.taeglich != null &&
                                this.taeglich.equals(other.getTaeglich()))) &&
                ((this.woechentlich == null && other.getWoechentlich() == null) ||
                        (this.woechentlich != null &&
                                this.woechentlich.equals(other.getWoechentlich()))) &&
                ((this.monatlich == null && other.getMonatlich() == null) ||
                        (this.monatlich != null &&
                                this.monatlich.equals(other.getMonatlich()))) &&
                ((this.jaehrlich == null && other.getJaehrlich() == null) ||
                        (this.jaehrlich != null &&
                                this.jaehrlich.equals(other.getJaehrlich())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTaeglich() != null) {
            _hashCode += getTaeglich().hashCode();
        }
        if (getWoechentlich() != null) {
            _hashCode += getWoechentlich().hashCode();
        }
        if (getMonatlich() != null) {
            _hashCode += getMonatlich().hashCode();
        }
        if (getJaehrlich() != null) {
            _hashCode += getJaehrlich().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
