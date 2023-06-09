/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.analysis;

import java.util.*;
import calculadora.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPAExpr().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inABSomaAExpr(ABSomaAExpr node)
    {
        defaultIn(node);
    }

    public void outABSomaAExpr(ABSomaAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABSomaAExpr(ABSomaAExpr node)
    {
        inABSomaAExpr(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outABSomaAExpr(node);
    }

    public void inAAMenosAExpr(AAMenosAExpr node)
    {
        defaultIn(node);
    }

    public void outAAMenosAExpr(AAMenosAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMenosAExpr(AAMenosAExpr node)
    {
        inAAMenosAExpr(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMenosAExpr(node);
    }

    public void inAAMultAExpr(AAMultAExpr node)
    {
        defaultIn(node);
    }

    public void outAAMultAExpr(AAMultAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMultAExpr(AAMultAExpr node)
    {
        inAAMultAExpr(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMultAExpr(node);
    }

    public void inAADivAExpr(AADivAExpr node)
    {
        defaultIn(node);
    }

    public void outAADivAExpr(AADivAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAADivAExpr(AADivAExpr node)
    {
        inAADivAExpr(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAADivAExpr(node);
    }

    public void inAAModAExpr(AAModAExpr node)
    {
        defaultIn(node);
    }

    public void outAAModAExpr(AAModAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAModAExpr(AAModAExpr node)
    {
        inAAModAExpr(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAModAExpr(node);
    }

    public void inAANumeroAExpr(AANumeroAExpr node)
    {
        defaultIn(node);
    }

    public void outAANumeroAExpr(AANumeroAExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANumeroAExpr(AANumeroAExpr node)
    {
        inAANumeroAExpr(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outAANumeroAExpr(node);
    }
}
