package es.cursonoruego.model.enums;

/**
 * CEFR - Common European Framework of Reference
 */
public enum LevelCefr {

	A1, // Beginner
	A2, // Elementary
	B1, // Pre-intermediate
	B2, // Intermediate
	C1, // Upper intermediate
	C2; // Advanced

	public int getWordCount() {
		return (ordinal() + 1) * 600;
	}
}
