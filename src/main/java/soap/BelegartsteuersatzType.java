/**
 * BelegartsteuersatzType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Ein für eine Belegart zugelassener Steuersatz
 */
public class BelegartsteuersatzType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BelegartsteuersatzType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegartsteuersatzType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("belegart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "belegart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("konto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buschluessel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buschluessel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("konto2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konto2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buschluessel2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buschluessel2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kontoFreelancer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kontoFreelancer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buschluesselFreelancer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buschluesselFreelancer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("konto2Freelancer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konto2Freelancer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buschluessel2Freelancer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buschluessel2Freelancer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Kurzbezeichnung der Belegart. */
    private String belegart;
    /* Der Steuersatz. */
    private Double steuersatz;
    /* Das für diesen Steuersatz zu verwendende Konto (bei Einsatz
     * des Moduls 'Export für Buchhaltung'). */
    private String konto;
    /* Der Buchungsschlüssel (bei Einsatz des Moduls 'Export für Buchhaltung'). */
    private String buschluessel;
    /* Ein weiteres Erlöskonto (bei Einsatz des Moduls 'Export für
     * Buchhaltung' und 70/30 Aufteilung des Beleges). */
    private String konto2;
    /* Der zweite Buchungsschlüssel (bei Einsatz des Moduls 'Export
     * für Buchhaltung' und 70/30 Aufteilung des Beleges). */
    private String buschluessel2;
    private String kontoFreelancer;
    private String buschluesselFreelancer;
    private String konto2Freelancer;
    private String buschluessel2Freelancer;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BelegartsteuersatzType() {
    }


    public BelegartsteuersatzType(
            String belegart,
            Double steuersatz,
            String konto,
            String buschluessel,
            String konto2,
            String buschluessel2,
            String kontoFreelancer,
            String buschluesselFreelancer,
            String konto2Freelancer,
            String buschluessel2Freelancer) {
        this.belegart = belegart;
        this.steuersatz = steuersatz;
        this.konto = konto;
        this.buschluessel = buschluessel;
        this.konto2 = konto2;
        this.buschluessel2 = buschluessel2;
        this.kontoFreelancer = kontoFreelancer;
        this.buschluesselFreelancer = buschluesselFreelancer;
        this.konto2Freelancer = konto2Freelancer;
        this.buschluessel2Freelancer = buschluessel2Freelancer;
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
     * Gets the belegart value for this BelegartsteuersatzType.
     *
     * @return belegart   * Die Kurzbezeichnung der Belegart.
     */
    public String getBelegart() {
        return belegart;
    }

    /**
     * Sets the belegart value for this BelegartsteuersatzType.
     *
     * @param belegart   * Die Kurzbezeichnung der Belegart.
     */
    public void setBelegart(String belegart) {
        this.belegart = belegart;
    }

    /**
     * Gets the steuersatz value for this BelegartsteuersatzType.
     *
     * @return steuersatz   * Der Steuersatz.
     */
    public Double getSteuersatz() {
        return steuersatz;
    }

    /**
     * Sets the steuersatz value for this BelegartsteuersatzType.
     *
     * @param steuersatz   * Der Steuersatz.
     */
    public void setSteuersatz(Double steuersatz) {
        this.steuersatz = steuersatz;
    }

    /**
     * Gets the konto value for this BelegartsteuersatzType.
     *
     * @return konto   * Das für diesen Steuersatz zu verwendende Konto (bei Einsatz
     * des Moduls 'Export für Buchhaltung').
     */
    public String getKonto() {
        return konto;
    }

    /**
     * Sets the konto value for this BelegartsteuersatzType.
     *
     * @param konto   * Das für diesen Steuersatz zu verwendende Konto (bei Einsatz
     * des Moduls 'Export für Buchhaltung').
     */
    public void setKonto(String konto) {
        this.konto = konto;
    }

    /**
     * Gets the buschluessel value for this BelegartsteuersatzType.
     *
     * @return buschluessel   * Der Buchungsschlüssel (bei Einsatz des Moduls 'Export für Buchhaltung').
     */
    public String getBuschluessel() {
        return buschluessel;
    }

    /**
     * Sets the buschluessel value for this BelegartsteuersatzType.
     *
     * @param buschluessel   * Der Buchungsschlüssel (bei Einsatz des Moduls 'Export für Buchhaltung').
     */
    public void setBuschluessel(String buschluessel) {
        this.buschluessel = buschluessel;
    }

    /**
     * Gets the konto2 value for this BelegartsteuersatzType.
     *
     * @return konto2   * Ein weiteres Erlöskonto (bei Einsatz des Moduls 'Export für
     * Buchhaltung' und 70/30 Aufteilung des Beleges).
     */
    public String getKonto2() {
        return konto2;
    }

    /**
     * Sets the konto2 value for this BelegartsteuersatzType.
     *
     * @param konto2   * Ein weiteres Erlöskonto (bei Einsatz des Moduls 'Export für
     * Buchhaltung' und 70/30 Aufteilung des Beleges).
     */
    public void setKonto2(String konto2) {
        this.konto2 = konto2;
    }

    /**
     * Gets the buschluessel2 value for this BelegartsteuersatzType.
     *
     * @return buschluessel2   * Der zweite Buchungsschlüssel (bei Einsatz des Moduls 'Export
     * für Buchhaltung' und 70/30 Aufteilung des Beleges).
     */
    public String getBuschluessel2() {
        return buschluessel2;
    }

    /**
     * Sets the buschluessel2 value for this BelegartsteuersatzType.
     *
     * @param buschluessel2   * Der zweite Buchungsschlüssel (bei Einsatz des Moduls 'Export
     * für Buchhaltung' und 70/30 Aufteilung des Beleges).
     */
    public void setBuschluessel2(String buschluessel2) {
        this.buschluessel2 = buschluessel2;
    }

    /**
     * Gets the kontoFreelancer value for this BelegartsteuersatzType.
     *
     * @return kontoFreelancer
     */
    public String getKontoFreelancer() {
        return kontoFreelancer;
    }

    /**
     * Sets the kontoFreelancer value for this BelegartsteuersatzType.
     *
     * @param kontoFreelancer
     */
    public void setKontoFreelancer(String kontoFreelancer) {
        this.kontoFreelancer = kontoFreelancer;
    }

    /**
     * Gets the buschluesselFreelancer value for this BelegartsteuersatzType.
     *
     * @return buschluesselFreelancer
     */
    public String getBuschluesselFreelancer() {
        return buschluesselFreelancer;
    }

    /**
     * Sets the buschluesselFreelancer value for this BelegartsteuersatzType.
     *
     * @param buschluesselFreelancer
     */
    public void setBuschluesselFreelancer(String buschluesselFreelancer) {
        this.buschluesselFreelancer = buschluesselFreelancer;
    }

    /**
     * Gets the konto2Freelancer value for this BelegartsteuersatzType.
     *
     * @return konto2Freelancer
     */
    public String getKonto2Freelancer() {
        return konto2Freelancer;
    }

    /**
     * Sets the konto2Freelancer value for this BelegartsteuersatzType.
     *
     * @param konto2Freelancer
     */
    public void setKonto2Freelancer(String konto2Freelancer) {
        this.konto2Freelancer = konto2Freelancer;
    }

    /**
     * Gets the buschluessel2Freelancer value for this BelegartsteuersatzType.
     *
     * @return buschluessel2Freelancer
     */
    public String getBuschluessel2Freelancer() {
        return buschluessel2Freelancer;
    }

    /**
     * Sets the buschluessel2Freelancer value for this BelegartsteuersatzType.
     *
     * @param buschluessel2Freelancer
     */
    public void setBuschluessel2Freelancer(String buschluessel2Freelancer) {
        this.buschluessel2Freelancer = buschluessel2Freelancer;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BelegartsteuersatzType)) return false;
        BelegartsteuersatzType other = (BelegartsteuersatzType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.belegart == null && other.getBelegart() == null) ||
                        (this.belegart != null &&
                                this.belegart.equals(other.getBelegart()))) &&
                ((this.steuersatz == null && other.getSteuersatz() == null) ||
                        (this.steuersatz != null &&
                                this.steuersatz.equals(other.getSteuersatz()))) &&
                ((this.konto == null && other.getKonto() == null) ||
                        (this.konto != null &&
                                this.konto.equals(other.getKonto()))) &&
                ((this.buschluessel == null && other.getBuschluessel() == null) ||
                        (this.buschluessel != null &&
                                this.buschluessel.equals(other.getBuschluessel()))) &&
                ((this.konto2 == null && other.getKonto2() == null) ||
                        (this.konto2 != null &&
                                this.konto2.equals(other.getKonto2()))) &&
                ((this.buschluessel2 == null && other.getBuschluessel2() == null) ||
                        (this.buschluessel2 != null &&
                                this.buschluessel2.equals(other.getBuschluessel2()))) &&
                ((this.kontoFreelancer == null && other.getKontoFreelancer() == null) ||
                        (this.kontoFreelancer != null &&
                                this.kontoFreelancer.equals(other.getKontoFreelancer()))) &&
                ((this.buschluesselFreelancer == null && other.getBuschluesselFreelancer() == null) ||
                        (this.buschluesselFreelancer != null &&
                                this.buschluesselFreelancer.equals(other.getBuschluesselFreelancer()))) &&
                ((this.konto2Freelancer == null && other.getKonto2Freelancer() == null) ||
                        (this.konto2Freelancer != null &&
                                this.konto2Freelancer.equals(other.getKonto2Freelancer()))) &&
                ((this.buschluessel2Freelancer == null && other.getBuschluessel2Freelancer() == null) ||
                        (this.buschluessel2Freelancer != null &&
                                this.buschluessel2Freelancer.equals(other.getBuschluessel2Freelancer())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBelegart() != null) {
            _hashCode += getBelegart().hashCode();
        }
        if (getSteuersatz() != null) {
            _hashCode += getSteuersatz().hashCode();
        }
        if (getKonto() != null) {
            _hashCode += getKonto().hashCode();
        }
        if (getBuschluessel() != null) {
            _hashCode += getBuschluessel().hashCode();
        }
        if (getKonto2() != null) {
            _hashCode += getKonto2().hashCode();
        }
        if (getBuschluessel2() != null) {
            _hashCode += getBuschluessel2().hashCode();
        }
        if (getKontoFreelancer() != null) {
            _hashCode += getKontoFreelancer().hashCode();
        }
        if (getBuschluesselFreelancer() != null) {
            _hashCode += getBuschluesselFreelancer().hashCode();
        }
        if (getKonto2Freelancer() != null) {
            _hashCode += getKonto2Freelancer().hashCode();
        }
        if (getBuschluessel2Freelancer() != null) {
            _hashCode += getBuschluessel2Freelancer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
