/**
 * The FndProfit entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndProfit implements  Serializable{
    static mapping = {
         table 'fnd_profit'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_profit_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'rpt_date'
         id column:'startdate'
         id column:'enddate'
         id composite:['fundId','rptDate','startdate','enddate'], generator:'assigned'
    }
    Long fundId
    Date rptDate
    Date startdate
    Date enddate
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    String rptSrc
    java.math.BigDecimal f002
    java.math.BigDecimal f005
    java.math.BigDecimal f006
    java.math.BigDecimal f010
    java.math.BigDecimal f008
    java.math.BigDecimal f013
    java.math.BigDecimal f014
    java.math.BigDecimal f016
    java.math.BigDecimal f023
    java.math.BigDecimal f028
    java.math.BigDecimal f031
    java.math.BigDecimal f035
    java.math.BigDecimal f034
    java.math.BigDecimal f036
    java.math.BigDecimal f037
    java.math.BigDecimal oprPrf
    java.math.BigDecimal prfLosEqu
    java.math.BigDecimal ditInc
    java.math.BigDecimal f038
    java.math.BigDecimal f039
    java.math.BigDecimal f040
    java.math.BigDecimal jp100000
    java.math.BigDecimal jp110000
    java.math.BigDecimal jp110101
    java.math.BigDecimal jp110201
    java.math.BigDecimal jp110301
    java.math.BigDecimal jp110401
    java.math.BigDecimal jp120000
    java.math.BigDecimal jp120101
    java.math.BigDecimal jp120201
    java.math.BigDecimal jp120301
    java.math.BigDecimal jp120401
    java.math.BigDecimal jp120501
    java.math.BigDecimal jp130000
    java.math.BigDecimal jp190000
    java.math.BigDecimal jp200000
    java.math.BigDecimal jp200101
    java.math.BigDecimal jp200201
    java.math.BigDecimal jp200301
    java.math.BigDecimal jp200401
    java.math.BigDecimal jp200501
    java.math.BigDecimal jp200511
    java.math.BigDecimal jp200601
    java.math.BigDecimal jp200701
    java.math.BigDecimal jp200801
    java.math.BigDecimal jp200901
    java.math.BigDecimal jp209901
    java.math.BigDecimal jp900000
    java.math.BigDecimal f032
    java.math.BigDecimal jp900101
    java.math.BigDecimal jp900201
    java.math.BigDecimal jp911004
    java.math.BigDecimal jp911009

    static constraints = {
        fundId(max: 9999999999L)
        rptDate()
        startdate()
        enddate()
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        rptSrc(size: 0..20)
        f002(nullable: true)
        f005(nullable: true)
        f006(nullable: true)
        f010(nullable: true)
        f008(nullable: true)
        f013(nullable: true)
        f014(nullable: true)
        f016(nullable: true)
        f023(nullable: true)
        f028(nullable: true)
        f031(nullable: true)
        f035(nullable: true)
        f034(nullable: true)
        f036(nullable: true)
        f037(nullable: true)
        oprPrf(nullable: true)
        prfLosEqu(nullable: true)
        ditInc(nullable: true)
        f038(nullable: true)
        f039(nullable: true)
        f040(nullable: true)
        jp100000(nullable: true)
        jp110000(nullable: true)
        jp110101(nullable: true)
        jp110201(nullable: true)
        jp110301(nullable: true)
        jp110401(nullable: true)
        jp120000(nullable: true)
        jp120101(nullable: true)
        jp120201(nullable: true)
        jp120301(nullable: true)
        jp120401(nullable: true)
        jp120501(nullable: true)
        jp130000(nullable: true)
        jp190000(nullable: true)
        jp200000(nullable: true)
        jp200101(nullable: true)
        jp200201(nullable: true)
        jp200301(nullable: true)
        jp200401(nullable: true)
        jp200501(nullable: true)
        jp200511(nullable: true)
        jp200601(nullable: true)
        jp200701(nullable: true)
        jp200801(nullable: true)
        jp200901(nullable: true)
        jp209901(nullable: true)
        jp900000(nullable: true)
        f032(nullable: true)
        jp900101(nullable: true)
        jp900201(nullable: true)
        jp911004(nullable: true)
        jp911009(nullable: true)
    }
    String toString() {
        return "${fundId}" 
    }
}
