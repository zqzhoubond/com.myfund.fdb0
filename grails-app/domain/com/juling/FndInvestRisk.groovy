/**
 * The FndInvestRisk entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndInvestRisk {
    static mapping = {
         table 'fnd_invest_risk'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_invest_risk_sequence']
         id generator:'identity', column:'INNER_CODE'
    }
    Long innerCode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    String invstTarget
    String invePrinc
    String invstOrient
    String invstTenet
    String invstStra
    String invstBench
    String deciAcco
    String deciProc
    String invstStkBench
    String performBench
    String allotPrinc
    String riskProfChar
    String riskManaTool
    String manaVent
    String redeVent
    String mktVent
    String techVent
    String othVent

    static constraints = {
        innerCode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        invstTarget()
        invePrinc()
        invstOrient()
        invstTenet()
        invstStra()
        invstBench()
        deciAcco()
        deciProc()
        invstStkBench()
        performBench()
        allotPrinc()
        riskProfChar()
        riskManaTool()
        manaVent()
        redeVent()
        mktVent()
        techVent()
        othVent()
    }
    String toString() {
        return "${innerCode}" 
    }
}
