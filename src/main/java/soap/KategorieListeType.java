/**
 * KategorieListeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Eine Liste von Kategorien.
 */
public class KategorieListeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(KategorieListeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kategorie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alteUeberschreiben");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alteUeberschreiben"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Liste der Kategorien. */
    private KategorieType[] kategorie;
    private Boolean alteUeberschreiben;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public KategorieListeType() {
    }

    public KategorieListeType(
            KategorieType[] kategorie,
            Boolean alteUeberschreiben) {
        this.kategorie = kategorie;
        this.alteUeberschreiben = alteUeberschreiben;
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
     * Gets the kategorie value for this KategorieListeType.
     *
     * @return kategorie   * Die Liste der Kategorien.
     */
    public KategorieType[] getKategorie() {
        return kategorie;
    }

    /**
     * Sets the kategorie value for this KategorieListeType.
     *
     * @param kategorie   * Die Liste der Kategorien.
     */
    public void setKategorie(KategorieType[] kategorie) {
        this.kategorie = kategorie;
    }

    public KategorieType getKategorie(int i) {
        return this.kategorie[i];
    }

    public void setKategorie(int i, KategorieType _value) {
        this.kategorie[i] = _value;
    }

    /**
     * Gets the alteUeberschreiben value for this KategorieListeType.
     *
     * @return alteUeberschreiben
     */
    public Boolean getAlteUeberschreiben() {
        return alteUeberschreiben;
    }

    /**
     * Sets the alteUeberschreiben value for this KategorieListeType.
     *
     * @param alteUeberschreiben
     */
    public void setAlteUeberschreiben(Boolean alteUeberschreiben) {
        this.alteUeberschreiben = alteUeberschreiben;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof KategorieListeType)) return false;
        KategorieListeType other = (KategorieListeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.kategorie == null && other.getKategorie() == null) ||
                        (this.kategorie != null &&
                                java.util.Arrays.equals(this.kategorie, other.getKategorie()))) &&
                ((this.alteUeberschreiben == null && other.getAlteUeberschreiben() == null) ||
                        (this.alteUeberschreiben != null &&
                                this.alteUeberschreiben.equals(other.getAlteUeberschreiben())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getKategorie() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKategorie());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKategorie(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAlteUeberschreiben() != null) {
            _hashCode += getAlteUeberschreiben().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
