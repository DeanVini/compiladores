/* This file was generated by SableCC (http://www.sablecc.org/). */

package calculadora.node;

import calculadora.analysis.*;

@SuppressWarnings("nls")
public final class AAModAExpr extends PAExpr
{
    private PAExpr _esq_;
    private PAExpr _dir_;

    public AAModAExpr()
    {
        // Constructor
    }

    public AAModAExpr(
        @SuppressWarnings("hiding") PAExpr _esq_,
        @SuppressWarnings("hiding") PAExpr _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AAModAExpr(
            cloneNode(this._esq_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAModAExpr(this);
    }

    public PAExpr getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PAExpr node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
    }

    public PAExpr getDir()
    {
        return this._dir_;
    }

    public void setDir(PAExpr node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PAExpr) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PAExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
