/**
 * The FndSplitTransl entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndSplitTransl implements  Serializable{
    static mapping = {
         table 'fnd_split_transl'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_split_transl_sequence']
         id generator:'identity', column:'INNER_CODE'
         id column:'declaredate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'sp_type', params:[sequence:'fnd_split_transl_sequence']
         id generator:'identity', column:'SP_TYPE'
         id composite:['innerCode','declaredate','spType'], generator:'assigned'
    }
    Long innerCode
    Date declaredate
    Long spType
    String infoSource
    String spTypeMark
    Date spDate
    String spCom
    java.math.BigDecimal spPorp
    Date resultDate
    Date chngRegDate
    java.math.BigDecimal netValue
    java.math.BigDecimal spPreShare
    java.math.BigDecimal spSithShare
    java.math.BigDecimal spPreUnitNv
    java.math.BigDecimal spSithUnitNv
    java.math.BigDecimal spPreAccuUnitNv
    java.math.BigDecimal spSithAccuUnitNv
    String spSithNvMark
    String spDtl
    Long declCls
    String declClsMark

    static constraints = {
        innerCode(max: 9999999999L)
        declaredate()
        spType(max: 9999999999L)
        infoSource(size: 0..100)
        spTypeMark(size: 0..50)
        spDate(nullable: true)
        spCom(size: 0..400)
        spPorp(nullable: true)
        resultDate(nullable: true)
        chngRegDate(nullable: true)
        netValue(nullable: true)
        spPreShare(nullable: true)
        spSithShare(nullable: true)
        spPreUnitNv(nullable: true)
        spSithUnitNv(nullable: true)
        spPreAccuUnitNv(nullable: true)
        spSithAccuUnitNv(nullable: true)
        spSithNvMark()
        spDtl()
        declCls(nullable: true, max: 9999999999L)
        declClsMark(size: 0..20)
    }
    String toString() {
        return "${innerCode}" 
    }
}
