/* Generated By:JJTree: Do not edit this line. ASTGeneralComp.java */

package net.sourceforge.pmd.jerry.ast.xpath;

public class ASTGeneralComp extends SimpleNode {
  public ASTGeneralComp(int id) {
    super(id);
  }

  public ASTGeneralComp(XPath2Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(XPath2ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}