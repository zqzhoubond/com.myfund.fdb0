/**
 * The FndOefIss entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndOefIss {
    static mapping = {
         table 'fnd_oef_iss'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_oef_iss_sequence']
         id generator:'identity', column:'INNER_CODE'
    }
    Long innerCode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date signDate
    Date declaredate
    String instaColl
    java.math.BigDecimal bookVal
    java.math.BigDecimal firCollTarg
    Date issStartdate
    Date issEnddate
    String issClsMark
    String issTarg
    java.math.BigDecimal existApplVal
    java.math.BigDecimal existApplNum
    Date failRefundDate
    String endTerm
    String feeStd
    java.math.BigDecimal truFeeRatio
    java.math.BigDecimal mngFeeRatio
    String appCls
    String payType
    java.math.BigDecimal collCapInte
    java.math.BigDecimal collCapConv
    Date appStartdate
    Date redeStartdate
    java.math.BigDecimal manaSize
    Long mensalCarryDate
    String applNotaDate
    String callNotaDate
    String callPayDate
    java.math.BigDecimal subCallPct
    String subCallTreat
    java.math.BigDecimal totAppAcc
    java.math.BigDecimal actUnit
    java.math.BigDecimal actVal
    java.math.BigDecimal totIssHar
    java.math.BigDecimal proportion
    String formula
    Long currency

    static constraints = {
        innerCode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        signDate(nullable: true)
        declaredate(nullable: true)
        instaColl(size: 0..40)
        bookVal(nullable: true)
        firCollTarg(nullable: true)
        issStartdate(nullable: true)
        issEnddate(nullable: true)
        issClsMark(size: 0..80)
        issTarg(size: 0..100)
        existApplVal(nullable: true)
        existApplNum(nullable: true)
        failRefundDate(nullable: true)
        endTerm()
        feeStd(size: 0..200)
        truFeeRatio(nullable: true)
        mngFeeRatio(nullable: true)
        appCls(size: 0..60)
        payType(size: 0..60)
        collCapInte(nullable: true)
        collCapConv(nullable: true)
        appStartdate(nullable: true)
        redeStartdate(nullable: true)
        manaSize(nullable: true)
        mensalCarryDate(nullable: true, max: 9999999999L)
        applNotaDate(size: 0..20)
        callNotaDate(size: 0..20)
        callPayDate(size: 0..20)
        subCallPct(nullable: true)
        subCallTreat()
        totAppAcc(nullable: true)
        actUnit(nullable: true)
        actVal(nullable: true)
        totIssHar(nullable: true)
        proportion(nullable: true)
        formula()
        currency(nullable: true, max: 9999999999L)
    }
    String toString() {
        return "${innerCode}" 
    }
}
