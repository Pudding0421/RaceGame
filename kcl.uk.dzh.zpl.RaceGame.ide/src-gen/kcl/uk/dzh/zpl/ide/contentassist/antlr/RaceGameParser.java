/*
 * generated by Xtext 2.26.0
 */
package kcl.uk.dzh.zpl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import kcl.uk.dzh.zpl.ide.contentassist.antlr.internal.InternalRaceGameParser;
import kcl.uk.dzh.zpl.services.RaceGameGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RaceGameParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RaceGameGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RaceGameGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getObstacleMemberAccess().getAlternatives(), "rule__ObstacleMember__Alternatives");
			builder.put(grammarAccess.getOptionSpecificationAccess().getAlternatives(), "rule__OptionSpecification__Alternatives");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAlternatives_1_1_0(), "rule__Addition__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAlternatives_1_1_0(), "rule__Multiplication__OperatorAlternatives_1_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getRaceGameAccess().getGroup(), "rule__RaceGame__Group__0");
			builder.put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
			builder.put(grammarAccess.getEndGameBehaviourAccess().getGroup(), "rule__EndGameBehaviour__Group__0");
			builder.put(grammarAccess.getScreenSpecificationAccess().getGroup(), "rule__ScreenSpecification__Group__0");
			builder.put(grammarAccess.getObstaclepecificationAccess().getGroup(), "rule__Obstaclepecification__Group__0");
			builder.put(grammarAccess.getWaterObstacleAccess().getGroup(), "rule__WaterObstacle__Group__0");
			builder.put(grammarAccess.getWallObstacleAccess().getGroup(), "rule__WallObstacle__Group__0");
			builder.put(grammarAccess.getFieldSpecificationAccess().getGroup(), "rule__FieldSpecification__Group__0");
			builder.put(grammarAccess.getSuperModeDeclarationAccess().getGroup(), "rule__SuperModeDeclaration__Group__0");
			builder.put(grammarAccess.getStartFieldDeclarationAccess().getGroup(), "rule__StartFieldDeclaration__Group__0");
			builder.put(grammarAccess.getAllowRestartMenuAccess().getGroup(), "rule__AllowRestartMenu__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getRaceGameAccess().getNameAssignment_1(), "rule__RaceGame__NameAssignment_1");
			builder.put(grammarAccess.getRaceGameAccess().getVariableAssignment_3(), "rule__RaceGame__VariableAssignment_3");
			builder.put(grammarAccess.getRaceGameAccess().getScreenAssignment_4(), "rule__RaceGame__ScreenAssignment_4");
			builder.put(grammarAccess.getRaceGameAccess().getFieldsAssignment_5(), "rule__RaceGame__FieldsAssignment_5");
			builder.put(grammarAccess.getRaceGameAccess().getOptionsAssignment_6(), "rule__RaceGame__OptionsAssignment_6");
			builder.put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3(), "rule__VariableDeclaration__ValueAssignment_3");
			builder.put(grammarAccess.getEndGameBehaviourAccess().getWinAssignment_2(), "rule__EndGameBehaviour__WinAssignment_2");
			builder.put(grammarAccess.getEndGameBehaviourAccess().getLostAssignment_4(), "rule__EndGameBehaviour__LostAssignment_4");
			builder.put(grammarAccess.getScreenSpecificationAccess().getNameAssignment_1(), "rule__ScreenSpecification__NameAssignment_1");
			builder.put(grammarAccess.getScreenSpecificationAccess().getScreenWidthAssignment_5(), "rule__ScreenSpecification__ScreenWidthAssignment_5");
			builder.put(grammarAccess.getScreenSpecificationAccess().getScreenHeightAssignment_8(), "rule__ScreenSpecification__ScreenHeightAssignment_8");
			builder.put(grammarAccess.getObstaclepecificationAccess().getNameAssignment_1(), "rule__Obstaclepecification__NameAssignment_1");
			builder.put(grammarAccess.getObstaclepecificationAccess().getFieldsAssignment_3(), "rule__Obstaclepecification__FieldsAssignment_3");
			builder.put(grammarAccess.getWaterObstacleAccess().getNameAssignment_1(), "rule__WaterObstacle__NameAssignment_1");
			builder.put(grammarAccess.getWallObstacleAccess().getNameAssignment_1(), "rule__WallObstacle__NameAssignment_1");
			builder.put(grammarAccess.getWallObstacleAccess().getWallWidthAssignment_5(), "rule__WallObstacle__WallWidthAssignment_5");
			builder.put(grammarAccess.getWallObstacleAccess().getWallHeightAssignment_8(), "rule__WallObstacle__WallHeightAssignment_8");
			builder.put(grammarAccess.getWallObstacleAccess().getWallPosXAssignment_11(), "rule__WallObstacle__WallPosXAssignment_11");
			builder.put(grammarAccess.getWallObstacleAccess().getWallPosYAssignment_14(), "rule__WallObstacle__WallPosYAssignment_14");
			builder.put(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1(), "rule__FieldSpecification__NameAssignment_1");
			builder.put(grammarAccess.getFieldSpecificationAccess().getEnemyCountAssignment_5(), "rule__FieldSpecification__EnemyCountAssignment_5");
			builder.put(grammarAccess.getFieldSpecificationAccess().getObstacleAssignment_6(), "rule__FieldSpecification__ObstacleAssignment_6");
			builder.put(grammarAccess.getFieldSpecificationAccess().getNextLevelAssignment_9(), "rule__FieldSpecification__NextLevelAssignment_9");
			builder.put(grammarAccess.getStartFieldDeclarationAccess().getFieldAssignment_2(), "rule__StartFieldDeclaration__FieldAssignment_2");
			builder.put(grammarAccess.getAdditionAccess().getOperatorAssignment_1_1(), "rule__Addition__OperatorAssignment_1_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
			builder.put(grammarAccess.getMultiplicationAccess().getOperatorAssignment_1_1(), "rule__Multiplication__OperatorAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
			builder.put(grammarAccess.getIntVarExpressionAccess().getVarAssignment(), "rule__IntVarExpression__VarAssignment");
			builder.put(grammarAccess.getIntLiteralAccess().getValAssignment(), "rule__IntLiteral__ValAssignment");
			builder.put(grammarAccess.getRealLiteralAccess().getValAssignment(), "rule__RealLiteral__ValAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RaceGameGrammarAccess grammarAccess;

	@Override
	protected InternalRaceGameParser createParser() {
		InternalRaceGameParser result = new InternalRaceGameParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RaceGameGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RaceGameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
