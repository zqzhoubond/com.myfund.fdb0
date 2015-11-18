/**
 * The FndDiv entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndDiv implements  Serializable{

    Long innerCode
    Date enddate
    Long declCls
    Long rank
    java.math.BigDecimal baseUnit
    Date ctime
    String declClsMark
    Date declaredate
   int div
    Long divCls
 String divClsMark
   String divObject
    java.math.BigDecimal divRemvTax
    Long divYear
    Date exDivDate
    java.math.BigDecimal fundUnit
    Long geniusUid
    java.math.BigDecimal isvalid
    Date mtime
    Date otcDivDate
    Date otcExDate
    Date payDate
    String payMemo
    Date reInvstDate
    Date reInvstSetDate
    Date recordDate
    Date reprchDate
    Long seq
    Date transDate
    java.math.BigDecimal unitNet

    static mapping = {
        table 'fnd_div'
        // version is set to false, because this isn't available by default for legacy databases
        version false
        // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_div_sequence']
        id generator:'identity', column:'INNER_CODE'
        id column:'ENDDATE'
//          In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'decl_cls', params:[sequence:'fnd_div_sequence']
        id generator:'identity', column:'DECL_CLS'
        // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'rank', params:[sequence:'fnd_div_sequence']
        id generator:'identity', column:'RANK'
        id composite:['innerCode','enddate','declCls','rank'], generator:'assigned'
//        divs column: 'DIV'
    }
    static constraints = {
        innerCode(max: 9223372036854775807L)
        enddate()
        declCls(max: 9223372036854775807L)
        rank(max: 9223372036854775807L)
        baseUnit(nullable: true)
        ctime()
        declClsMark(size: 1..20, blank: false)
        declaredate(nullable: true)
       div(nullable: true,size:4..6)
        divCls(nullable: true, max: 9223372036854775807L)
        divClsMark(size: 1..50, blank: false)
        divObject(size: 1..200, blank: false)
        divRemvTax(nullable: true)
        divYear(nullable: true, max: 9223372036854775807L)
        exDivDate(nullable: true)
        fundUnit(nullable: true)
        geniusUid(max: 9223372036854775807L)
        isvalid()
        mtime()
        otcDivDate(nullable: true)
        otcExDate(nullable: true)
        payDate(nullable: true)
        payMemo(size: 1..255, blank: false)
        reInvstDate(nullable: true)
        reInvstSetDate(nullable: true)
        recordDate(nullable: true)
        reprchDate(nullable: true)
        seq(max: 9223372036854775807L)
        transDate(nullable: true)
        unitNet(nullable: true)
    }
    String toString() {
        return "${innerCode}" 
    }
}
