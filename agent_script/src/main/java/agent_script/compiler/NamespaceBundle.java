package agent_script.compiler;

import agent_script.compiler.analyzer.Symbol;
import agent_script.compiler.analyzer.namespace.NamespaceDefinition;
import agent_script.compiler.analyzer.type.InferredType;
import org.antlr.v4.runtime.tree.ParseTree;

import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

/**
 * Represents an intermediate result during compilation.
 */
public class NamespaceBundle {
    /**
     * The root source path of the namespace.
     */
    private final Path rootSourcePath;

    /**
     * The source path of the namespace.
     */
    private final Path sourcePath;

    /**
     * The original agent script source.
     */
    private String source;

    /**
     * The parse tree produced from the source.
     */
    private ParseTree parseTree;

    /**
     * The namespace definition.
     */
    private NamespaceDefinition namespaceDefinition;

    /**
     * The symbol table.
     */
    private Map<ParseTree, Set<Symbol>> symbolTable;

    /**
     * The inferred types.
     */
    private Map<ParseTree, InferredType> inferredTypes;

    /**
     * The java source to compile.
     */
    private String javaSource;

    /**
     * The byte code of the compiled class.
     */
    private byte[] javaClassBytes;

    /**
     * The loaded java class.
     */
    private Class<?> javaClass;

    public NamespaceBundle(Path rootSourcePath, Path sourcePath) {
        this.rootSourcePath = rootSourcePath;
        this.sourcePath = sourcePath;
    }

    /**
     * @return the value of {@link #rootSourcePath}
     */
    public Path getRootSourcePath() {
        return rootSourcePath;
    }

    /**
     * @return the value of {@link #sourcePath}
     */
    public Path getSourcePath() {
        return sourcePath;
    }

    /**
     * @return the value of {@link #source}
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the value of {@link #source}
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the value of {@link #parseTree}
     */
    public ParseTree getParseTree() {
        return parseTree;
    }

    /**
     * @param parseTree the value of {@link #parseTree}
     */
    public void setParseTree(ParseTree parseTree) {
        this.parseTree = parseTree;
    }

    /**
     * @return the value of {@link #namespaceDefinition}
     */
    public NamespaceDefinition getNamespaceDefinition() {
        return namespaceDefinition;
    }

    /**
     * @param namespaceDefinition the value of {@link #namespaceDefinition}
     */
    public void setNamespaceDefinition(NamespaceDefinition namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
    }

    /**
     * @return the value of {@link #symbolTable}
     */
    public Map<ParseTree, Set<Symbol>> getSymbolTable() {
        return symbolTable;
    }

    /**
     * @param symbolTable the value of {@link #symbolTable}
     */
    public void setSymbolTable(Map<ParseTree, Set<Symbol>> symbolTable) {
        this.symbolTable = symbolTable;
    }

    /**
     * @return the value of {@link #inferredTypes}
     */
    public Map<ParseTree, InferredType> getInferredTypes() {
        return inferredTypes;
    }

    /**
     * @param inferredTypes the value of {@link #inferredTypes}
     */
    public void setInferredTypes(Map<ParseTree, InferredType> inferredTypes) {
        this.inferredTypes = inferredTypes;
    }

    /**
     * @return the value of {@link #javaSource}
     */
    public String getJavaSource() {
        return javaSource;
    }

    /**
     * @param javaSource the value of {@link #javaSource}
     */
    public void setJavaSource(String javaSource) {
        this.javaSource = javaSource;
    }

    /**
     * @return the value of {@link #javaClassBytes}
     */
    public byte[] getJavaClassBytes() {
        return javaClassBytes;
    }

    /**
     * @param javaClassBytes the value of {@link #javaClassBytes}
     */
    public void setJavaClassBytes(byte[] javaClassBytes) {
        this.javaClassBytes = javaClassBytes;
    }

    /**
     * @return the value of {@link #javaClass}
     */
    public Class<?> getJavaClass() {
        return javaClass;
    }

    /**
     * @param javaClass the value of {@link #javaClass}
     */
    public void setJavaClass(Class<?> javaClass) {
        this.javaClass = javaClass;
    }
}
