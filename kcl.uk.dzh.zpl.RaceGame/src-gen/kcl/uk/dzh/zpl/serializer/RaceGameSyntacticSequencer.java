/*
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.serializer;

import com.google.inject.Inject;
import java.util.List;
import kcl.uk.dzh.zpl.services.RaceGameGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RaceGameSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RaceGameGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_3_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_3_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RaceGameGrammarAccess) access;
		match_Primary_LeftParenthesisKeyword_3_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
		match_Primary_LeftParenthesisKeyword_3_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Primary_LeftParenthesisKeyword_3_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_3_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) val=INT
	 *     (rule start) (ambiguity) val=REAL
	 *     (rule start) (ambiguity) var=[VariableDeclaration|ID]
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {Addition.left=}
	 *     (rule start) (ambiguity) {Multiplication.left=}
	 
	 * </pre>
	 */
	protected void emit_Primary_LeftParenthesisKeyword_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
