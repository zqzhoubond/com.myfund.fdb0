/**
 * The FndBalance entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndBalance implements  Serializable{
    static mapping = {
         table 'fnd_balance'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_balance_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'rpt_date'
         id column:'enddate'
         id composite:['fundId','rptDate','enddate'], generator:'assigned'
    }
    Long fundId
    Date rptDate
    Date enddate
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    String rptSrc
    Date declaredate
//    java.math.BigDecimal b110101
//    java.math.BigDecimal b110201
//    java.math.BigDecimal b110300
//    java.math.BigDecimal b112001
//    java.math.BigDecimal b110301
//    java.math.BigDecimal b110311
//    java.math.BigDecimal b110321
//    java.math.BigDecimal b110401
//    java.math.BigDecimal b110411
//    java.math.BigDecimal b110421
//    java.math.BigDecimal b110501
//    java.math.BigDecimal b110511
//    java.math.BigDecimal b110601
//    java.math.BigDecimal b110611
//    java.math.BigDecimal b110621
//    java.math.BigDecimal b110701
//    java.math.BigDecimal b110801
//    java.math.BigDecimal b110901
//    java.math.BigDecimal b111001
//    java.math.BigDecimal b111101
//    java.math.BigDecimal b111201
//    java.math.BigDecimal b111301
//    java.math.BigDecimal b111401
//    java.math.BigDecimal b111501
//    java.math.BigDecimal b111601
//    java.math.BigDecimal b111701
//    java.math.BigDecimal b111801
//    java.math.BigDecimal b111901
//    java.math.BigDecimal b100000
//    java.math.BigDecimal b210101
//    java.math.BigDecimal b210201
//    java.math.BigDecimal b210301
//    java.math.BigDecimal b210401
//    java.math.BigDecimal b210501
//    java.math.BigDecimal b210601
//    java.math.BigDecimal b210701
//    java.math.BigDecimal b210801
//    java.math.BigDecimal b210901
//    java.math.BigDecimal b211001
//    java.math.BigDecimal b211101
//    java.math.BigDecimal b211201
//    java.math.BigDecimal b211301
//    java.math.BigDecimal b211401
//    java.math.BigDecimal b211501
//    java.math.BigDecimal b211601
//    java.math.BigDecimal b211701
//    java.math.BigDecimal b211801
//    java.math.BigDecimal b211901
//    java.math.BigDecimal b212001
//    java.math.BigDecimal b219901
//    java.math.BigDecimal b200000
//    java.math.BigDecimal b310101
//    java.math.BigDecimal b310201
//    java.math.BigDecimal b310301
//    java.math.BigDecimal b310401
//    java.math.BigDecimal b310501
//    java.math.BigDecimal b310601
//    java.math.BigDecimal b300000
//    java.math.BigDecimal b400000
//    java.math.BigDecimal b510101
//    java.math.BigDecimal b510201
//    java.math.BigDecimal b911001
//    java.math.BigDecimal b911005
//    java.math.BigDecimal b911008

    static constraints = {
        fundId(max: 9999999999L)
        rptDate()
        enddate()
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        rptSrc(size: 0..20)
        declaredate(nullable: true)
//        b110101(nullable: true)
//        b110201(nullable: true)
//        b110300(nullable: true)
//        b112001(nullable: true)
//        b110301(nullable: true)
//        b110311(nullable: true)
//        b110321(nullable: true)
//        b110401(nullable: true)
//        b110411(nullable: true)
//        b110421(nullable: true)
//        b110501(nullable: true)
//        b110511(nullable: true)
//        b110601(nullable: true)
//        b110611(nullable: true)
//        b110621(nullable: true)
//        b110701(nullable: true)
//        b110801(nullable: true)
//        b110901(nullable: true)
//        b111001(nullable: true)
//        b111101(nullable: true)
//        b111201(nullable: true)
//        b111301(nullable: true)
//        b111401(nullable: true)
//        b111501(nullable: true)
//        b111601(nullable: true)
//        b111701(nullable: true)
//        b111801(nullable: true)
//        b111901(nullable: true)
//        b100000(nullable: true)
//        b210101(nullable: true)
//        b210201(nullable: true)
//        b210301(nullable: true)
//        b210401(nullable: true)
//        b210501(nullable: true)
//        b210601(nullable: true)
//        b210701(nullable: true)
//        b210801(nullable: true)
//        b210901(nullable: true)
//        b211001(nullable: true)
//        b211101(nullable: true)
//        b211201(nullable: true)
//        b211301(nullable: true)
//        b211401(nullable: true)
//        b211501(nullable: true)
//        b211601(nullable: true)
//        b211701(nullable: true)
//        b211801(nullable: true)
//        b211901(nullable: true)
//        b212001(nullable: true)
//        b219901(nullable: true)
//        b200000(nullable: true)
//        b310101(nullable: true)
//        b310201(nullable: true)
//        b310301(nullable: true)
//        b310401(nullable: true)
//        b310501(nullable: true)
//        b310601(nullable: true)
//        b300000(nullable: true)
//        b400000(nullable: true)
//        b510101(nullable: true)
//        b510201(nullable: true)
//        b911001(nullable: true)
//        b911005(nullable: true)
//        b911008(nullable: true)
    }
    String toString() {
        return "${fundId}" 
    }
}
